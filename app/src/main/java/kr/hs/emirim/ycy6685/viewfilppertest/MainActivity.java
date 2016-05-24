package kr.hs.emirim.ycy6685.viewfilppertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper viewFlip; //얘는 전역변수여야 한다

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butPrev=(Button)findViewById(R.id.but_prev);//참조 변수로 선언, 버튼은 지역 변수도 괜찮아, 뷰로 반환되므로 버튼으로 형변환
        Button butNext=(Button)findViewById(R.id.but_next);
        butPrev.setOnClickListener(this);
        butNext.setOnClickListener(this);
        viewFlip=(ViewFlipper) findViewById(R.id.view_flip);

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) { //v는 이벤트가 발생된 객체의 참조값을 가지고 있음 이걸로 무슨 버튼인지 알아냄 id 비교해서

        switch(v.getId()) {
            case R.id.but_prev:
                viewFlip.showPrevious();
                break;
            case R.id.but_next:
                viewFlip.showNext();
                break;
        }

    }
} //메인 액티비티에 온클릭 리스너를 만들면 따로 핸들러를 만들지 않아도 메인이 이벤트 핸들러가 된다

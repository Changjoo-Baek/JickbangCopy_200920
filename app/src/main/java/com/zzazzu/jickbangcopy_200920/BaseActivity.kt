package com.zzazzu.jickbangcopy_200920

import androidx.appcompat.app.AppCompatActivity


// 추상클래스입니다 라고 표현하기 위해 class 앞에 abstract 추가

abstract class BaseActivity : AppCompatActivity() {

// 어느 곳에서 this를 사용하던 통합하기 위해서.. 변수 앞에 m이 붙는건 멤버 변수라고 명칭하는것이다.
    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()


}
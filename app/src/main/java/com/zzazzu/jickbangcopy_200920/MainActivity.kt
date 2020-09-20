package com.zzazzu.jickbangcopy_200920

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// oncreate 안에 꼭 setupevents, setvalues룰 정의해줘야 한다.
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {
        TODO("Not yet implemented")₩
    }

    override fun setValues() {



    }

}
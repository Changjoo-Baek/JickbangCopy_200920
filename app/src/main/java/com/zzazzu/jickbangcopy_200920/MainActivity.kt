package com.zzazzu.jickbangcopy_200920

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

// oncreate 안에 꼭 setupevents, setvalues룰 정의해줘야 한다.
class MainActivity : BaseActivity() {

    val mRooms = ArrayList<Room>()

    lateinit var mRoomAdapter : RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {


    }

    override fun setValues() {

        mRooms.add(Room(8500, "서울시 은평구", 5, "은평구의 5층 방 입니다."))
        mRooms.add(Room(78000, "서울시 은평구", 3, "은평구의 3층 방 입니다."))
        mRooms.add(Room(2400, "서울시 은평구", 0, "은평구의 반지하 방 입니다."))
        mRooms.add(Room(23500, "서울시 서대문구", -1, "서대문구의 지하 1층 방 입니다."))
        mRooms.add(Room(175000, "서울시 서대문구", 4, "서대문구의 4층 방 입니다."))
        mRooms.add(Room(55000, "서울시 서대문구", 7, "서대문구의 7층 방 입니다."))
        mRooms.add(Room(9600, "서울시 동대문구", 0, "동대문구의 반지하 방 입니다."))
        mRooms.add(Room(38000, "서울시 동대문구", 2, "동대문구의 2층 방 입니다."))
        mRooms.add(Room(57000, "서울시 동대문구", -2, "동대문구의 지하 2층 방 입니다."))
        mRooms.add(Room(85000, "서울시 동대문구", 5, "동대문구의 5층 방 입니다."))

        mRoomAdapter = RoomAdapter(mContext, R.layout.recent_list_item, mRooms)
        roomListView.adapter = mRoomAdapter




    }

}
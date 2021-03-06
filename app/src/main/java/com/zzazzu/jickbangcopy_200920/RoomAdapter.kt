package com.zzazzu.jickbangcopy_200920

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

//import android.widget.ArrayAdapter
//import


class RoomAdapter(
    val mContext:Context,
    val resId:Int,
    val mList:ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.recent_list_item,null)
        }

        val row = tempRow!!

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFllorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)


        return row

    }
}

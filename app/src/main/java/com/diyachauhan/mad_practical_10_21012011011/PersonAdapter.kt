package com.diyachauhan.mad_practical_10_21012011011

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import com.diyachauhan.mad_practical_10_21012011011.MapsActivity
import com.diyachauhan.mad_practical_10_21012011011.Person
import com.diyachauhan.mad_practical_10_21012011011.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PersonAdapter(val context: Context,val personArray:ArrayList<Person>):ArrayAdapter<Person>(context,0,personArray)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view=LayoutInflater.from(context).inflate(R.layout.person_item,parent,false)
        val contact=getItem(position)

        view.findViewById<TextView>(R.id.name).text = contact?.name
        view.findViewById<TextView>(R.id.mobile).text = contact?.phoneNo
        view.findViewById<TextView>(R.id.emailid).text = contact?.emailId
        view.findViewById<TextView>(R.id.address).text = contact?.address
        view.findViewById<FloatingActionButton>(R.id.btnLocation).setOnClickListener{
             //Start the MapsActivity when button1 is clicked
            val intent = Intent(context, MapsActivity::class.java)
            context.startActivity(intent)
        }
        return view
    }
}
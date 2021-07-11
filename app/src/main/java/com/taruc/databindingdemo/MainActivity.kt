package com.taruc.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.taruc.databindingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson :Person = Person("Ky","123456","ky@example.com","No123,JalanTBR")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.personData = aPerson
        /*
        binding.tvName.text = aPerson.name
        binding.tvIC.text = aPerson.ic
        binding.tvEmail.text = aPerson.email
        binding.tvAddress.text = aPerson.address
        */

        binding.button.setOnClickListener(){
            aPerson.email = "ky@gmail.com"
            aPerson.address = "No111,Jalan Tunku Abdul Rahman"
            binding.apply { invalidateAll() }
        }

    }
}
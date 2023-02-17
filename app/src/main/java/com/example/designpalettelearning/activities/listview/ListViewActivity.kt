package com.example.designpalettelearning.activities.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designpalettelearning.R
import com.example.designpalettelearning.activities.extensions.MyAppCompatActivity
import com.example.designpalettelearning.databinding.ListViewActivityBinding

class ListViewActivity : MyAppCompatActivity("ListView") {
    lateinit var binding: ListViewActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ListViewActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createActions()
    }

    private fun createActions() {
        binding.buttonSimpleAdapter.setOnClickListener {
            val intent = Intent(this, SimpleAdapterUsage::class.java)
            startActivity(intent)
        }
    }
}
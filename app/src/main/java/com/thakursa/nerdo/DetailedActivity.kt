package com.thakursa.nerdo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thakursa.nerdo.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val time = intent.getStringExtra("time")
            val ingredients = intent.getIntExtra("ingredients", R.string.maggiIngredients)
            val desc = intent.getIntExtra("desc", R.string.maggieDesc)
            val image = intent.getIntExtra("image", R.drawable.biopsy)

            binding.detailName.text = name
            binding.detailImage.setImageResource(image)
        }
    }
}
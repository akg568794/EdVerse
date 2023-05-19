package com.thakursa.nerdo

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity
import com.thakursa.nerdo.databinding.ActivityMedicalBinding

class MedicalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMedicalBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMedicalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = intArrayOf(
            R.drawable.biopsy,
            R.drawable.blood_transfusion,
            R.drawable.c_section,
            R.drawable.colonoscopy,
            R.drawable.endoscopy,
            R.drawable.leparoscopy,
            R.drawable.organ_transplant
        )
        val ingredientList = intArrayOf(
            R.string.pastaIngredients,
            R.string.maggiIngredients,
            R.string.cakeIngredients,
            R.string.pancakeIngredients,
            R.string.pizzaIngredients,
            R.string.burgerIngredients,
            R.string.friesIngredients
        )
        val descList = intArrayOf(
            R.string.pastaDesc,
            R.string.maggieDesc,
            R.string.cakeDesc,
            R.string.pancakeDesc,
            R.string.pizzaDesc,
            R.string.burgerDesc,
            R.string.friesDesc
        )
        val nameList = arrayOf("Surgery", "Blood Transfusion", "C Section", "Colonoscopy", "Endoscopy", "Laparoscopy", "Organ Transplant")
        val timeList = arrayOf("30 mins", "2 mins", "45 mins", "10 mins", "60 mins", "45 mins", "30 mins")

        for (i in imageList.indices) {
            listData = ListData(
                nameList[i],
                timeList[i], ingredientList[i], descList[i], imageList[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = ListAdapter(this@MedicalActivity, dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true

        binding.listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@MedicalActivity, DetailedActivity::class.java)
            intent.putExtra("name", nameList[i])
            intent.putExtra("time", timeList[i])
            intent.putExtra("ingredients", ingredientList[i])
            intent.putExtra("desc", descList[i])
            intent.putExtra("image", imageList[i])
            startActivity(intent)
            if(nameList[i]=="Surgery"){
                val intent1 = Intent(this@MedicalActivity, surgery::class.java)
                startActivity(intent1)
            }
            else {
                startActivity(intent)
            }
        }

    }
}
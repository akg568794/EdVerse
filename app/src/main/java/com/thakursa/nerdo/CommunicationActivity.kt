package com.thakursa.nerdo

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity
import com.thakursa.nerdo.databinding.ActivityCommunicationBinding

class CommunicationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCommunicationBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommunicationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = intArrayOf(
            R.drawable.reading_book_icon_74___copy,
            R.drawable.writing,
            R.drawable.listening_removebg_preview,
            R.drawable.speaking_removebg_preview,
            R.drawable.non_verbal_removebg_preview,
            R.drawable.presenting_removebg_preview,
            R.drawable.interviewing_removebg_preview
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
        val nameList = arrayOf("Reading", "Writing", "Listening", "Speaking", "Non Verbal", "Presenting", "Interviewing")
        val timeList = arrayOf("30 mins", "2 mins", "45 mins", "10 mins", "60 mins", "45 mins", "30 mins")

        for (i in imageList.indices) {
            listData = ListData(
                nameList[i],
                timeList[i], ingredientList[i], descList[i], imageList[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = ListAdapter(this@CommunicationActivity, dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true

        binding.listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@CommunicationActivity, DetailedActivity::class.java)
            intent.putExtra("name", nameList[i])
            intent.putExtra("time", timeList[i])
            intent.putExtra("ingredients", ingredientList[i])
            intent.putExtra("desc", descList[i])
            intent.putExtra("image", imageList[i])
            if(nameList[i]=="Interviewing"){
                val intent1 = Intent(this@CommunicationActivity, interview::class.java)
                startActivity(intent1)
            }
            else {
                startActivity(intent)
            }
        }

    }
}
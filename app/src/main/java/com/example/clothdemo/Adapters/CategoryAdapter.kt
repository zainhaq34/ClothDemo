package com.example.clothdemo.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.clothdemo.Model.Category
import com.example.clothdemo.R
import kotlinx.android.synthetic.main.activity_main.*

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    // Constructor Param Initialize
    val mContext = context
    val mCategories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // Declare View
        val categoryView : View

        /***
         *  Bind custom list item [category_list_item.xml]
         */
        // Bind Layout
        categoryView = LayoutInflater.from(mContext).inflate(R.layout.category_list_item, null)

        // Bind Widgets
        val categoryName : TextView = categoryView.findViewById(R.id.categoryTextView)
        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImageView)

        // Initialize Categories
        val categroy = mCategories[position]
        // category Title
        categoryName.text = categroy.title
        // category image
        val resourceId = mContext.resources.getIdentifier(categroy.image, "drawable", mContext.packageName)
        categoryImage.setImageResource(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
       // Get Categories position item
        return mCategories[position]
    }

    override fun getItemId(position: Int): Long {
       // Generate auto list IDs
        return 0
    }

    override fun getCount(): Int {
        // Count number of rows list data in table view
        return mCategories.count()
    }
}
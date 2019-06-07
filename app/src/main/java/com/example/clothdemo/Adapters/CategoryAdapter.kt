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

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    // Constructor Param Initialize
    val mContext = context
    val mCategories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // Declare View
        val categoryView : View

        // Declare view Holder
        val holder : CategoryViewHolder

        if (convertView == null)
        {
            /***
             *  Bind custom list item category_list_item.xml
             */
            // Bind Layout
            categoryView = LayoutInflater.from(mContext).inflate(R.layout.category_list_item, null)

            // Initialize View Holder
            holder = CategoryViewHolder()

            // Bind Widgets
            holder.categoryName = categoryView.findViewById(R.id.categoryTextView)
            holder.categoryImage = categoryView.findViewById(R.id.categoryImageView)
            println("I exist for the First time")
            categoryView.tag =holder
        }else
        {
            // Recycle View Holder
            holder = convertView.tag as CategoryViewHolder
            categoryView = convertView
            println("Recycle List")
        }



        // Initialize Categories
        val category = mCategories[position]
        // category Title
        holder.categoryName?.text = category.title
        // category image
        val resourceId = mContext.resources.getIdentifier(category.image, "drawable", mContext.packageName)
        holder.categoryImage?.setImageResource(resourceId)

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

    /***
     * View Holder - CategoryViewHolder Class
     */
    private class CategoryViewHolder {
        var categoryName: TextView? = null
        var categoryImage: ImageView? = null
    }
}
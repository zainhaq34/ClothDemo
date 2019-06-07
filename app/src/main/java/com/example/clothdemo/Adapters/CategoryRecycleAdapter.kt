package com.example.clothdemo.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.clothdemo.Model.Category
import com.example.clothdemo.R

class CategoryRecycleAdapter(val mContext: Context, val mCategories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.CategoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {

        // set Category List Item Layout with View Holder
        val view = LayoutInflater.from(mContext)
            .inflate(R.layout.category_list_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
    return mCategories.count()
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

        // Bind the category view holder
        holder?.bindCategory(mCategories[position], mContext)
    }

    // View holder of Categories
    inner class CategoryViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryTextView)
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImageView)

        fun bindCategory(category: Category, context: Context) {

            val resourceId = context.resources.getIdentifier(category.image,
                "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }
}
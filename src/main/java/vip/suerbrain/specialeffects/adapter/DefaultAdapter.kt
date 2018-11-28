package vip.suerbrain.specialeffects.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import vip.suerbrain.specialeffects.R

open class DefaultAdapter : RecyclerView.Adapter<DefaultAdapter.Companion.DefaultViewHolder>() {

    var itemSize = 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DefaultViewHolder {
        return DefaultViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.abc_action_bar_title_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemSize
    }

    override fun onBindViewHolder(defaultViewHolder: DefaultViewHolder, positon: Int) {
    }

    companion object {
        class DefaultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        }
    }
}
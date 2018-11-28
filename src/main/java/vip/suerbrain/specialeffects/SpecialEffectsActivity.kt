package vip.suerbrain.specialeffects

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_special_efects_nested_scroll.*
import vip.suerbrain.specialeffects.adapter.DefaultAdapter

class SpecialEffectsActivity : AppCompatActivity() {

    companion object {
        open fun startSpecialEffectsActivity(context: Context) {
            var intent = Intent(context, SpecialEffectsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_special_efects_nested_scroll)
        init()
    }

    fun init() {
        rcv_container.adapter = DefaultAdapter()
        rcv_container.layoutManager = LinearLayoutManager(this)
    }
}
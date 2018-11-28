package vip.suerbrain.specialeffects

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init() {
        btn_common_effects.setOnClickListener(this)
        btn_special_effects.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btn_common_effects ->
                Toast.makeText(this, "普通效果", Toast.LENGTH_SHORT).show()
            R.id.btn_special_effects -> {
                Toast.makeText(this, "特殊效果", Toast.LENGTH_SHORT).show()
                SpecialEffectsActivity.startSpecialEffectsActivity(this)
            }
        }
    }
}
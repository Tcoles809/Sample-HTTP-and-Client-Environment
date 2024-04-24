package cpsc411.simplehttpclient

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class StatusGenerator(val ctx : Context) {
    fun generate() : LinearLayout {
        val layoutObj = LinearLayout(ctx)
        val lParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutObj.layoutParams = lParams
        layoutObj.orientation = LinearLayout.VERTICAL
        //  layoutObj.setBackgroundColor(Color.GREEN)
        val lbParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT)
        //    lbParams.gravity = GRAVITY.RIGHT
        lbParams.weight = 1.0F
        lbParams.topMargin = 222

        var lbl = TextView(ctx)
        lbl.text = "Status Message"
        lbl.gravity = Gravity.CENTER
        lbl.setBackgroundColor(Color.YELLOW)
        layoutObj.addView(lbl, lbParams)

        return layoutObj
    }
}
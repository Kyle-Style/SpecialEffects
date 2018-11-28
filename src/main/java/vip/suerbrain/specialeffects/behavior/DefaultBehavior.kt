package vip.suerbrain.specialeffects.behavior

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.v4.widget.NestedScrollView
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

open class DefaultBehavior : CoordinatorLayout.Behavior<NestedScrollView> {

    constructor() : super()
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    override fun onDependentViewChanged(parent: CoordinatorLayout, child: NestedScrollView, dependency: View): Boolean {
        //return super.onDependentViewChanged(parent, child, dependency)
        return dependency is NestedScrollView
    }

    override fun onLayoutChild(parent: CoordinatorLayout, child: NestedScrollView, layoutDirection: Int): Boolean {


        return super.onLayoutChild(parent, child, layoutDirection)
    }

    override fun onInterceptTouchEvent(parent: CoordinatorLayout, child: NestedScrollView, ev: MotionEvent): Boolean {
        return super.onInterceptTouchEvent(parent, child, ev)
    }

    override fun onTouchEvent(parent: CoordinatorLayout, child: NestedScrollView, ev: MotionEvent): Boolean {
        return super.onTouchEvent(parent, child, ev)
    }
}
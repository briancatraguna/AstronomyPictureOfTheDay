package com.briancatraguna.feature.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import com.briancatraguna.feature.R


@BindingAdapter("app:imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        imgView.load(imgUrl) {
            placeholder(R.drawable.loading_animation)
            error(R.drawable.ic_broken_image)
        }
    }
}

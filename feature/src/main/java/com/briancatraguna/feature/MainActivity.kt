package com.briancatraguna.feature

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.viewModels
import com.briancatraguna.feature.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            vm = viewModel
            lifecycleOwner = this@MainActivity
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.share) {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.apply {
                putExtra(Intent.EXTRA_SUBJECT, resources.getString(R.string.share_subject))
                putExtra(
                    Intent.EXTRA_TEXT,
                    resources.getString(R.string.share_text, viewModel.astroPicture.value?.hdUrl)
                )
                type = "text/plain"
            }
            startActivity(shareIntent)
            true
        } else super.onOptionsItemSelected(item)

    }
}
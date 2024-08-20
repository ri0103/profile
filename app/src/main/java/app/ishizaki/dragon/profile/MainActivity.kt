package app.ishizaki.dragon.profile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import app.ishizaki.dragon.profile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        binding.profileImage.isVisible = false
        binding.profileCommentText.isVisible = false

        binding.showProfileButton.setOnClickListener {
            binding.profileImage.isVisible = true
            binding.profileCommentText.isVisible = true

        }
    }
}
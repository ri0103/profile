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

//        binding.profileImage.isVisible = false
//        binding.profileCommentText.isVisible = false

        binding.showProfileButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.randy_image)
            binding.profileLabelText.text = "名前"
            binding.profileCommentText.text = "Androidメンターのランディだよ"
        }

        binding.showSportButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.baseball_image)
            binding.profileLabelText.text = "スポーツ"
            binding.profileCommentText.text = "野球観戦が好きで、スタジアムに通っている"
        }

        binding.showFoodButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.donut_image)
            binding.profileLabelText.text = "好きな食べ物"
            binding.profileCommentText.text = "キャンディやドーナツが大好き"
        }

        binding.showHobbyButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.gadget_image)
            binding.profileLabelText.text = "趣味"
            binding.profileCommentText.text = "ガジェットを集めて動かすこと"
        }
    }
}
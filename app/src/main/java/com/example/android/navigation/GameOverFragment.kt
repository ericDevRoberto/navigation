package com.example.android.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_game_over.*

class GameOverFragment : Fragment(R.layout.fragment_game_over) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tryAgainButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
        }
    }
}

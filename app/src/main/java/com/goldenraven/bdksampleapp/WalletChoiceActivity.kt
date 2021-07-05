/*
 * Copyright 2021 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE file.
 */

package com.goldenraven.bdksampleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.goldenraven.bdksampleapp.databinding.ActivityWalletChoiceBinding

class WalletChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityWalletChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(findViewById(R.id.toolbar))

        binding.thankYouButton.setOnClickListener {
            val intent: Intent = Intent(this, WalletActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
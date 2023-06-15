package com.example.webview

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.webview.databinding.TabOneFragmentBinding

class TabOneFragment : Fragment() {
    private lateinit var binding : TabOneFragmentBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TabOneFragmentBinding.inflate(inflater, container, false)

        binding.webView1.settings.javaScriptEnabled = true
        binding.webView1.webViewClient = WebViewClient()
        binding.webView1.loadUrl("https://comic.naver.com/webtoon?tab=wed")
        return binding.root
    }
}
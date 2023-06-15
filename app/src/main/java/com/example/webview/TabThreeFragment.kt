package com.example.webview

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.webview.databinding.TabThreeFragmentBinding

class TabThreeFragment : Fragment() {
    private lateinit var binding : TabThreeFragmentBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TabThreeFragmentBinding.inflate(inflater, container, false)

        binding.webView3.settings.javaScriptEnabled = true
        binding.webView3.webViewClient = WebViewClient()
        binding.webView3.loadUrl("https://comic.naver.com/webtoon?tab=fri")
        return binding.root
    }
}
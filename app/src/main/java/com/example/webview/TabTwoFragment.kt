package com.example.webview

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment

import com.example.webview.databinding.TabTwoFragmentBinding

class TabTwoFragment : Fragment() {
    private lateinit var binding : TabTwoFragmentBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TabTwoFragmentBinding.inflate(inflater, container, false)

        binding.webView2.settings.javaScriptEnabled = true
        binding.webView2.webViewClient = WebViewClient()
        binding.webView2.loadUrl("https://comic.naver.com/webtoon?tab=thu")
        return binding.root
    }
}
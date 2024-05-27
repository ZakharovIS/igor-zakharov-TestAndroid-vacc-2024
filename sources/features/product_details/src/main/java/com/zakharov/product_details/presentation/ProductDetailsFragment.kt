package com.zakharov.product_details.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.zakharov.core.App
import com.zakharov.product_details.R
import com.zakharov.product_details.data.utils.getIngredients
import com.zakharov.product_details.databinding.FragmentProductDetailsBinding
import com.zakharov.product_details.di.DaggerProductDetailsComponent
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val KEY_PRODUCT_ID = "Key ID"

class ProductDetailsFragment : Fragment() {

    @Inject
    lateinit var vmFactory: ProductDetailsViewModelFactory

    private lateinit var viewModel: ProductDetailsViewModel

    private lateinit var binding: FragmentProductDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        DaggerProductDetailsComponent.factory()
            .create((requireActivity().application as App).getNetworkProvider()).inject(this)

        viewModel = ViewModelProvider(this, vmFactory)[ProductDetailsViewModel::class]
        arguments?.getInt(KEY_PRODUCT_ID)?.let { viewModel.loadProduct(it) }
        binding = FragmentProductDetailsBinding.inflate(inflater, container, false)
        bindProductDetails()
        setTopMenu()
        return binding.root
    }

    private fun bindProductDetails() {
        viewLifecycleOwner.lifecycleScope
            .launch {
                viewModel.product
                    .collect { productDetails ->
                        if (productDetails != null) {
                            Glide.with(requireContext())
                                .load(productDetails.pictureURL)
                                .into(binding.appBarImage)
                            binding.productName.text = productDetails.name
                            binding.tags.text = productDetails.strTags
                            binding.titleIngredients.text = productDetails.getIngredients()
                        }
                    }
            }
    }

    private fun setTopMenu() {
        binding.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.like -> {
                    it.isChecked = !it.isChecked
                    if (it.isChecked) it.setIcon(R.drawable._697449_heart_like_love_twitter_icon)
                    else it.setIcon(R.drawable._697449_heart_like_love_twitter_icon_blank)
                    true
                }

                else -> {
                    true
                }
            }
        }
        binding.topAppBar.setNavigationOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}

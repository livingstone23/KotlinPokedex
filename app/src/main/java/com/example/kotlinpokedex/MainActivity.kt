package com.example.kotlinpokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity(), ListFragment.PokemonSelectListener  {

    private lateinit var detailFragment: DetailFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //detailFragment = supportFragmentManager.findFragmentById(R.id.detail_fragment) as DetailFragment
    }

    override fun onPokemonSelected(pokemon: Pokemon) {
        //detailFragment.setPokemonData(pokemon)
        findNavController(R.id.main_navigation_container)
            .navigate(ListFragmentDirections.actionListFragmentToPokemonDetailFragment(pokemon))
    }





}

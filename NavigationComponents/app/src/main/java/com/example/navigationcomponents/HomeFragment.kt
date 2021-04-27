package com.example.navigationcomponents


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment.findNavController


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_home, container, false)
        val rb: Button = v.findViewById(R.id.redFragment)
        val bb: Button = v.findViewById(R.id.blueFragment)
        val gb: Button = v.findViewById(R.id.greensFragment)
        rb.setOnClickListener {
            findNavController(this).navigate(R.id.action_homeFragment_to_redFragment2)
        }

        bb.setOnClickListener {
            findNavController(this).navigate(R.id.action_homeFragment_to_blueFragment2)
        }

        gb.setOnClickListener {
            findNavController(this).navigate(R.id.action_homeFragment_to_greensFragment2)
        }


        return v
    }











    
}

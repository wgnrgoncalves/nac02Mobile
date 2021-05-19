package br.com.fiap.mobile.nac002

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import br.com.fiap.mobile.nac002.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var bindings: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindings = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindings.btnCalcular.setOnClickListener {

            var n1: Int?
            var n2: Int?
            var r : Int = 0

            n1 = bindings.txtNum1.text.toString().toIntOrNull()
            n2 = bindings.txtNum2.text.toString().toIntOrNull();

            if(n1 != null && n2 != null){
                r = n1 + n2;
            }


            var action = HomeFragmentDirections.actionHomeFragmentToResultFragment(r)
            findNavController().navigate(action)


            //findNavController().navigate(R.id.action_homeFragment_to_resultFragment, )


        }


    }

}
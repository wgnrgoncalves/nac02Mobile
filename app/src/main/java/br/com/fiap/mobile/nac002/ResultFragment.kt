package br.com.fiap.mobile.nac002

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import br.com.fiap.mobile.nac002.databinding.FragmentHomeBinding
import br.com.fiap.mobile.nac002.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private lateinit var bindings : FragmentResultBinding
    private val args : ResultFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_result, container, false)
        bindings = DataBindingUtil.inflate(inflater, R.layout.fragment_result, container, false)
        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindings.textView3.text = args.resultado.toString()
    }

}
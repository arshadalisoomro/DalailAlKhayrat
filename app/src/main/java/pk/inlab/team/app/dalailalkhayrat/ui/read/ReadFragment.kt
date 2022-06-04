package pk.inlab.team.app.dalailalkhayrat.ui.read

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import pk.inlab.team.app.dalailalkhayrat.databinding.FragmentReadBinding

class ReadFragment : Fragment() {

    private var _binding: FragmentReadBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val readViewModel =
            ViewModelProvider(this)[ReadViewModel::class.java]

        _binding = FragmentReadBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textReflow
        readViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
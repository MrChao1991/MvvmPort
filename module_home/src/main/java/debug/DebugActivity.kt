package debug

import androidx.fragment.app.Fragment
import com.cfox.module_home.HomeMainFragment


class DebugActivity : DebugBaseActivity() {

    override fun createFragment(): Fragment {
//        val fragment = ARouter.getInstance().build(RouterPath.HOME_MAIN_FRAGMENT).navigation()
        return HomeMainFragment()//fragment as Fragment
    }
}
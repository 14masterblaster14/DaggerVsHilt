package com.example.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 *  Hilt : Wrapper for Dagger
 *  Hilt Dependencies : Add in Project level , app level gradle
 *
 *  Hilt currently supports the following Android classes:
 *                                   Application (by using @HiltAndroidApp)
 *                                   ViewModel (by using @HiltViewModel)
 *                                   Activity
 *                                   Fragment
 *                                   View
 *                                   Service
 *                                   BroadcastReceiver
 *
 *  Hilt provides the following components:
 *                                   Hilt component	                Injector for
 *
 *                                   SingletonComponent	            Application
 *                                   ActivityRetainedComponent	    N/A
 *                                   ViewModelComponent	            ViewModel
 *                                   ActivityComponent              Activity
 *                                   FragmentComponent              Fragment
 *                                   ViewComponent                  View
 *                                   ViewWithFragmentComponent	    View annotated with @WithFragmentBindings
 *                                   ServiceComponent	            Service
 */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var dataSource: DataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dataSource.getRemoteData()
    }
}
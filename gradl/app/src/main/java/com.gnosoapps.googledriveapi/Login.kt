package com.gnosoapps.googledriveapi

import ...

class Login : AppCompatActivity() {
    companion object {
        const val CONST_SIGN_IN = 34
    }

    private lateinit var auth: FirebaseAuth
    private lateinit var googleAuth: GoogleSignInClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        auth = FirebaseAuth.getInstance()
        var login = findViewById<Buffer>(R.id.Login)
        login.setOnClickListener {
            GoogleSignIn()
        }

        val gso = GoogleSignInOptions
            .Builder(GoogleSignINoptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.clientid))
            .requestEmail()
            .build()
    }
}
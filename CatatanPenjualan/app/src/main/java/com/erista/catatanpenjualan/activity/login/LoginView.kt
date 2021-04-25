package com.erista.catatanpenjualan.activity.login

import com.erista.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}
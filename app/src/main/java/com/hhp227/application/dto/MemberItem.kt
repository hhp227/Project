package com.hhp227.application.dto

data class MemberItem(
    var id: Int = 0,
    var name: String? = null,
    var email: String? = null,
    var profileImage: String? = null,
    var timeStamp: String? = null
)
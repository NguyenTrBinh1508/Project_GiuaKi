package com.example.ktgk

import android.os.Parcel
import android.os.Parcelable

data class account(val ten:String? , val email : String? , val sdt : String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(ten)
        parcel.writeString(email)
        parcel.writeString(sdt)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<account> {
        override fun createFromParcel(parcel: Parcel): account {
            return account(parcel)
        }

        override fun newArray(size: Int): Array<account?> {
            return arrayOfNulls(size)
        }
    }
}
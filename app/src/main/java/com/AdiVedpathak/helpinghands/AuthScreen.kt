package com.AdiVedpathak.helpinghands

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun AuthScreen(
    viewModel: AuthViewModel = hiltViewModel()
) {
    // Use viewModel to access FirebaseAuth functions
}

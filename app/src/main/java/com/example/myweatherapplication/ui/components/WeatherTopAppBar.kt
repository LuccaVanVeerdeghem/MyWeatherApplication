package com.example.myweatherapplication.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource


/**
 * Composable voor de topbar met weergerelateerde schermtitel en navigatieknoppen.
 *
 * @param canNavigateBack Geeft aan of de terugknop moet worden weergegeven (true) of verborgen (false).
 * @param navigateUp Callback-functie voor het uitvoeren van de navigatie naar boven.
 * @param currentScreenTitle Resource ID van de huidige schermtitel die moet worden weergegeven.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeatherTopAppBar(canNavigateBack: Boolean, navigateUp: () -> Unit, currentScreenTitle: Int) {
    TopAppBar(
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),

        title = {
            Text(stringResource(id = currentScreenTitle))
        },
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "navigate back",
                    )
                }
            }
        },
    )
}
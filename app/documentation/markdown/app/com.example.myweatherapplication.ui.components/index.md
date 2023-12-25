//[app](../../index.md)/[com.example.myweatherapplication.ui.components](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [CardInfo](-card-info/index.md) | [androidJvm]<br>data class [CardInfo](-card-info/index.md)(val modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val unit: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Dataklasse voor het opslaan van WeatherInfoCard-informatie. |

## Functions

| Name | Summary |
|---|---|
| [CreateTask](-create-task.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [CreateTask](-create-task.md)(weatherLocationName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), onWeatherLocationNameChanged: ([String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onWeatherLocationSave: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onDismissRequest: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), errorMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Composable voor het maken van een dialoogvenster voor het toevoegen van een nieuwe weerlocatie. |
| [CreateWeatherLocationPreview](-create-weather-location-preview.md) | [androidJvm]<br>@[Preview](https://developer.android.com/reference/kotlin/androidx/compose/ui/tooling/preview/Preview.html)<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [CreateWeatherLocationPreview](-create-weather-location-preview.md)() |
| [CurrentWeatherOverview](-current-weather-overview.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [CurrentWeatherOverview](-current-weather-overview.md)(modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html), currentWeatherViewModel: [LocationWeatherViewModel](../com.example.myweatherapplication.ui.viewModel/-location-weather-view-model/index.md) = viewModel(factory = LocationWeatherViewModel.Factory), location: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;Gent&quot;)<br>Composable voor het weergeven van het huidige weeroverzicht. |
| [MyWeatherInfoCard](-my-weather-info-card.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [MyWeatherInfoCard](-my-weather-info-card.md)(cardInfo: [CardInfo](-card-info/index.md))<br>Composable voor het weergeven van een weerinfo-kaart. |
| [WeatherBottomAppBar](-weather-bottom-app-bar.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [WeatherBottomAppBar](-weather-bottom-app-bar.md)(goHome: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), goToAbout: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), showAddLocation: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Composable voor de bottombar van de weerapplicatie. |
| [WeatherInfoGrid](-weather-info-grid.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [WeatherInfoGrid](-weather-info-grid.md)(locatieInfo: [LocatieInfo](../com.example.myweatherapplication.ui.model/-locatie-info/index.md), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html))<br>Composable voor het weergeven van weerinformatie in een raster. |
| [WeatherLocation](-weather-location.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [WeatherLocation](-weather-location.md)(modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html), goToClickedLocation: (locatie: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), locatie: [LocatieInfo](../com.example.myweatherapplication.ui.model/-locatie-info/index.md))<br>Composable voor het weergeven van individuele weerlocatie-informatie in de lijst. |
| [WeatherLocationIdentifier](-weather-location-identifier.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [WeatherLocationIdentifier](-weather-location-identifier.md)(locatie: [LocatieInfo](../com.example.myweatherapplication.ui.model/-locatie-info/index.md), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html))<br>Composable voor het weergeven van locatie-informatie. |
| [WeatherLocations](-weather-locations.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [WeatherLocations](-weather-locations.md)(modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html), goToClickedLocation: (locatie: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), locationWeatherViewModel: [LocationWeatherViewModel](../com.example.myweatherapplication.ui.viewModel/-location-weather-view-model/index.md) = viewModel(factory = LocationWeatherViewModel.Factory))<br>Composable voor het weergeven van de lijst met opgeslagen weerlocaties. |
| [WeatherTopAppBar](-weather-top-app-bar.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [WeatherTopAppBar](-weather-top-app-bar.md)(canNavigateBack: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), navigateUp: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), currentScreenTitle: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Composable voor de topbar met weergerelateerde schermtitel en navigatieknoppen. |
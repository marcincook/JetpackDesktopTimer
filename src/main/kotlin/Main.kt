import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {


    MaterialTheme {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
            //.background(Color.Yellow)
        ) {
            val stopWatch = remember { StopWatch() }

            StopWatchDisplay(
                formatedTime = stopWatch.formattedTime,
                onStartClick = stopWatch::start,
                onPauseClick = stopWatch::pause,
                onResetClick = stopWatch::reset
            )
        }


    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "mTimer",
        alwaysOnTop = true,
        transparent = true,
        undecorated = true,
        resizable = true,

        state = WindowState(
            position = WindowPosition(x = 0.dp, y = 0.dp),
            size = DpSize(width = 560.dp, height = 340.dp)
        )
    ) {
        App()
    }
}

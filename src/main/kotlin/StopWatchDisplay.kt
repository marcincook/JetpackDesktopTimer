
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.awt.event.WindowEvent
import javax.swing.JFrame

@Composable
fun StopWatchDisplay(
    formatedTime: String,
    onStartClick: () -> Unit,
    onPauseClick: () -> Unit,
    onResetClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier.padding(start = 16.dp, end = 16.dp, top = 0.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Row (
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
//            Button(onClick = ::onCloseRequest) {
//                Text(text = "Close Application")
//
//            }
            IconButton(onClick = ::onCloseRequest) {
                Icon(Icons.Default.Close, contentDescription = "Close")
            }

        }
        Text(
            text = formatedTime,
            fontWeight = FontWeight.Thin,
            fontSize = 96.sp,
            lineHeight = 80.sp,
            color = Color.Red
        )
        Spacer(Modifier.size(16.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {

            Button(onClick = onStartClick ) {
                Text("Start", fontSize = 32.sp, fontWeight = FontWeight.Normal, modifier = Modifier.padding(16.dp))
            }
//            Spacer(
//                Modifier.size(16.dp)
//            )
            Button(onClick = onPauseClick) {
                Text("Pause", fontSize = 32.sp, fontWeight = FontWeight.Normal, modifier = Modifier.padding(16.dp))
            }
//            Spacer(
//                Modifier.size(16.dp)
//            )
            Button(onClick = onResetClick) {
                Text("Reset", fontSize = 32.sp, fontWeight = FontWeight.Normal, modifier = Modifier.padding(16.dp))
            }

        }
    }
}

//fun exitApplication() {
//    TODO("Not yet implemented")
//}

fun exitApplication(window: JFrame) {
    window.dispatchEvent(WindowEvent(window, WindowEvent.WINDOW_CLOSING))
}

fun onCloseRequest() {
    System.exit(0) // Zamknij aplikację
}




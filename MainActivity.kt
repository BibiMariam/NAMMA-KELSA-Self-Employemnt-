package com.example.nammakelsa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nammakelsa.ui.theme.NAMMAKELSAThemeimport android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NAMMAKELSATheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NAMMAKELSATheme {
        Greeting("Android")
    }
}
un initialWorkers(): MutableList<Worker> = mutableListOf(
Worker(1, "Ravi Kumar", "Painter", "🎨", "Hosakote", 1.2, 650, "+91 98450 11122",
4.8, 87, true, 12, true,
listOf("Modern living room - 2BHK", "Exterior wall painting", "Texture wall finish")),
Worker(2, "Manjunath S", "Plumber", "🔧", "Devanahalli", 2.8, 700, "+91 98450 22233",
4.6, 64, true, 8, true,
listOf("Bathroom pipe replacement", "Kitchen sink repair", "Water tank installation")),
Worker(3, "Suresh Babu", "Tiler", "🧱", "Hosakote", 1.8, 800, "+91 98450 33344",
4.9, 112, true, 15, true,
listOf("Marble flooring 1200 sqft", "Bathroom tiles design", "Kitchen backsplash")),
Worker(4, "Govinda Raju", "Gardener", "🌱", "Anekal", 4.5, 450, "+91 98450 44455",
4.5, 38, false, 5, true,
listOf("Lawn maintenance", "Vegetable garden setup", "Tree pruning")),
Worker(5, "Mohan Lal", "Electrician", "⚡", "Hosakote", 0.8, 750, "+91 98450 55566",
4.7, 95, true, 10, false,
listOf("Full house wiring", "Inverter installation", "AC electrical work")),
Worker(6, "Lakshmi Bai", "Tailor", "✂️", "Devanahalli", 3.2, 500, "+91 98450 66677",
4.9, 156, true, 18, true,
listOf("Salwar suits stitching", "Blouse fitting", "Curtain making")),
Worker(7, "Krishnappa", "Carpenter", "🪵", "Anekal", 5.1, 850, "+91 98450 77788",
4.4, 52, true, 9, true,
listOf("Wooden almirah custom", "Door frame fitting", "Modular kitchen")),
Worker(8, "Hanumanthu", "Mason", "🏗️", "Hosur", 7.2, 900, "+91 98450 88899",
4.6, 78, true, 14, false,
listOf("Compound wall construction", "House foundation", "Pillar work")),
Worker(9, "Venkatesh M", "AC Repair", "❄️", "Devanahalli", 3.5, 600, "+91 98450 99900",
4.5, 43, false, 6, true,
listOf("Window AC service", "Split AC gas refill", "AC installation")),
Worker(10, "Shankar Naik", "Welder", "🔥", "Magadi", 9.8, 750, "+91 98450 10011",
4.3, 29, false, 7, true,
listOf("Iron gate fabrication", "Window grills", "Steel door frame")),
Worker(11, "Basavaraj", "Painter", "🎨", "Anekal", 4.0, 600, "+91 98450 21122",
4.4, 41, false, 6, true,
listOf("Interior 1BHK painting", "Wood polish work", "Ceiling design")),
Worker(12, "Saraswathi", "House Cleaner", "🧹", "Hosakote", 2.0, 400, "+91 98450 32233",
4.8, 124, true, 11, true,
listOf("Deep house cleaning", "Post-construction cleanup", "Kitchen degreasing"))
)

val allSkills = listOf(
    "All", "Painter", "Plumber", "Electrician", "Tiler", "Carpenter",
    "Gardener", "Mason", "AC Repair", "Tailor", "Welder", "House Cleaner"
# DeconvolutionPlugin

A simple blind deconvolution plugin for [Fiji](https://fiji.sc/) / ImageJ written in Java.

## 🔬 What It Does

This plugin performs basic blind deconvolution using:
- Initial grayscale estimation
- Richardson-Lucy-style multiplicative updates
- Channel-wise RGB deblurring
- Uniform PSF assumption with adjustable size

## 🧪 How to Use

1. Open Fiji.
2. Load a blurry RGB image.
3. Run the plugin from:
   ```
   Plugins > Deconvolution > Blind Deconvolution
   ```
4. Choose the PSF size and number of iterations.
5. View the deconvolved output and compare results!

## 🛠️ Build the Plugin

```bash
./gradlew clean build
```

Copy the JAR from `build/libs/` to your `Fiji.app/plugins/` folder.

## 🧬 Tech Stack

- Java 8
- Gradle Kotlin DSL
- ImageJ / Fiji Plugin API

## 📁 Project Structure

```
src/
├── main/
│   ├── java/org/example/BlindDeconvolution.java
│   └── resources/plugins.config
```

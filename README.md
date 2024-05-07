# Rabbit R1 IMEI Generator (rabbit-r1-imeigen)

Rabbit R1 IMEI Generator is a JavaScript-based tool designed to generate and validate IMEI numbers for Rabbit R1 devices.

## Live version
[Click here to use the IMEI Generator](https://annabelsandford.github.io/rabbit-r1-imeigen/imei_check_v1.html)

## How it Works

### IMEI Overview

The IMEI is a unique identifier assigned to mobile phones and other devices. It consists of 15 digits and is used to identify legitimate devices.

### TAC (Type Allocation Code)

The first 8 digits of the IMEI represent the TAC (Type Allocation Code). The TAC uniquely identifies the device manufacturer and model. In the case of Rabbit R1 devices, the TAC is "35847631".

### Checksum Calculation

The last digit of the IMEI serves as a checksum, which helps ensure the correctness of the IMEI. It is calculated using the Luhn algorithm, also known as the Modulus 10 algorithm. This algorithm verifies the integrity of the IMEI by performing a series of calculations on the digits.

### Functionality

1. **Validation:** The tool validates the correctness of an entered IMEI by calculating its checksum and comparing it with the last digit. If they match, the IMEI is considered valid.

2. **Generation:** When generating a valid IMEI, the tool uses the predefined TAC for Rabbit R1's ("35847631") and generates a serial number. It then calculates the checksum and appends it to the IMEI.

## Usage

1. Enter the IMEI number in the input field labeled "Enter IMEI."
2. Click the "Validate" button to check the validity of the entered IMEI.
3. Click the "Generate Valid IMEI" button to generate a new valid IMEI.
4. The result of the validation or the generated IMEI will be displayed below the buttons.

## License

This program is open-source and provided for educational purposes only. You may use, modify, and distribute it under the terms of the GNU Affero General Public License v3.0 license. See the License file for details.

## Authors

- **Sabrina Sandford** - [@annielunaire](https://x.com/annielunaire)

## Disclaimer

This tool is intended for educational purposes only. It generates valid IMEI numbers according to specified parameters but should not be used for any illegal or unethical activities.

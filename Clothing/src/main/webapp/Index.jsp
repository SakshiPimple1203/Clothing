<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clothing Order Form</title>
    <style>
        /* Add your CSS styling here */
    </style>
</head>
<body>
    <form action="addOrder" method="post">
        <!-- Existing form fields -->
        <select name="item">
            <option value="Dress">Dress</option>
            <option value="Top">Top</option>
            <option value="Blouse">Blouse</option>
            <option value="Pant">Pant</option>
        </select><br>
        <label for="customerName">Name of Customer:</label>
        <input type="text" id="customerName" name="customerName" required><br>
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber" required><br>
        <label for="shoulder">Shoulder (in inches):</label>
        <input type="text" id="shoulder" name="shoulder" required><br>
        <label for="chest">Chest (in inches):</label>
        <input type="text" id="chest" name="chest" required><br>
        <label for="bust">Bust (in inches):</label>
        <input type="text" id="bust" name="bust" required><br>
        <label for="waist">Waist (in inches):</label>
        <input type="text" id="waist" name="waist" required><br>
        <label for="hipRound">Hip Round (in inches):</label>
        <input type="text" id="hipRound" name="hipRound" required><br>
        <label for="armRound">Arm Round (in inches):</label>
        <input type="text" id="armRound" name="armRound" required><br>
        <label for="sleeves">Sleeves (in inches):</label>
        <input type="text" id="sleeves" name="sleeves" required><br>
        <label for="penaltyCrease">Penalty Crease (in inches):</label>
        <input type="text" id="penaltyCrease" name="penaltyCrease" required><br>
        <label for="length">Length (in inches):</label>
        <input type="text" id="length" name="length" required><br>
        <label for="backNeck">Back Neck (in inches):</label>
        <input type="text" id="backNeck" name="backNeck" required><br>
        <label for="frontNeck">Front Neck (in inches):</label>
        <input type="text" id="frontNeck" name="frontNeck" required><br>
        <label for="note">Note:</label>
        <textarea id="note" name="note"></textarea><br>
        <label for="deliveryDate">Date of Delivery:</label>
        <input type="date" id="deliveryDate" name="deliveryDate" required><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

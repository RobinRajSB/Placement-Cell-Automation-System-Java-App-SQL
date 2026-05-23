# Placement Cell Automation System

A Java-based desktop application for managing college placement activities, built with Swing GUI and SQL database integration.

## Overview

This is a mini project developed for the fifth semester B.Tech curriculum. The application provides a comprehensive platform for managing student placements, including student registration, company listing, and placement tracking.

## Features

- **Student Registration**: Register students with personal details, educational background, and placement preferences
- **Login System**: Secure login for accessing placement information
- **Company Listings**: View available companies and their job openings
- **Multi-Field Support**: Software Engineering, Civil Engineering, and Mechanical Engineering
- **Salary Range Selection**: Students can specify minimum expected salary
- **Educational Qualifications**: Support for Diploma, Degree, and Post-Graduate candidates
- **Database Integration**: SQL database for persistent data storage

## Technology Stack

- **Language**: Java
- **GUI Framework**: Swing (AWT)
- **Database**: Microsoft Access (ODBC Driver)
- **IDE**: NetBeans / Eclipse
- **Database Driver**: JDBC-ODBC Bridge

## Project Structure

```
├── app.java              # Main application window with student registration form
├── appdetail.java        # Application details handler
├── emp.java              # Employee/Company management
├── empdetail.java        # Employee details handler
├── login.java            # Login interface
├── go.mdb                # Microsoft Access database file
└── README.md             # Project documentation
```

## System Requirements

- Java 7 or higher
- Microsoft Access or compatible database
- Windows OS (for ODBC support)
- 256 MB RAM minimum
- 10 MB disk space

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/RobinRajSB/Placement-Cell-Automation-System-Java-App-SQL.git
   cd Placement-Cell-Automation-System-Java-App-SQL
   ```

2. **Compile the Java files**:
   ```bash
   javac *.java
   ```

3. **Set up the database**:
   - Place the `go.mdb` file in your project directory
   - Configure ODBC data source named "go" pointing to go.mdb
   - On Windows, use: Control Panel → Administrative Tools → Data Sources (ODBC)

4. **Run the application**:
   ```bash
   java app
   ```

## Usage

### Student Registration
1. Launch the application
2. Fill in your personal details (Name, Age, Gender)
3. Select your educational qualification
4. Choose your preferred engineering field
5. Specify minimum expected salary
6. Click "Submit" to register

### Login
- Use credentials to access placement information
- View companies matching your profile
- Track your placement status

## Database Schema

The application uses the following main tables:

- **Applicant**: Stores student registration information
- **Company**: Stores company details and job openings
- **Placement**: Tracks placement records

## Future Enhancements

- [ ] Migrate from MS Access to MySQL/PostgreSQL
- [ ] Web-based interface
- [ ] Admin dashboard for placement cell coordinators
- [ ] Email notifications
- [ ] Mobile application support
- [ ] Advanced filtering and search capabilities
- [ ] Interview scheduling module

## Known Limitations

- ODBC driver compatibility issues on non-Windows systems
- Single-user database (not suitable for concurrent access)
- Basic authentication mechanism
- Limited error handling

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file for details.

## Author

**Robin Raj SB**

## Contributing

This is an academic project. Feel free to fork and modify for educational purposes.

## Disclaimer

This is a B.Tech mini project created for learning purposes. It may not follow all production-level coding standards and security best practices.

---

*Last Updated: May 2026*

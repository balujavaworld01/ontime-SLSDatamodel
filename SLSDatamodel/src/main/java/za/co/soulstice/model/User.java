/*
 * Auruminfo Powered by Soulstice.
 */
package za.co.soulstice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

// TODO: Auto-generated Javadoc
@Entity
@Table(name = "user_")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;

	private String address;

	private String companyName;

	private String country;

	private String emailAddress;

	@Column(name = "emailVerified", columnDefinition = "BIT", nullable = true)
	private boolean emailVerified;

	private long failedLoginAttempts;

	private String gcmUserId;

	private String imeiNumber;

	private String lastLoggedInIp;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginDate;

	private String loginIp;

	@Temporal(TemporalType.TIMESTAMP)
	private Date logoutDate;

	private String make;

	private String makeModel;

	private String middleName;

	private String mobileAppId;

	private String osType;

	private String password;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String firstName;

	private String lastName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date passwordModifiedDate;

	@Column(name = "passwordUpdated", columnDefinition = "BIT", nullable = true)
	private boolean passwordUpdated;

	private String phoneNumber;

	private String requestSource;

	@Column(name = "selfRegistration", columnDefinition = "BIT", nullable = true)
	private boolean selfRegistration;

	@Column(name = "smartPhone", columnDefinition = "BIT", nullable = true)
	private boolean smartPhone;

	@Column(name = "status", columnDefinition = "BIT", nullable = true)
	private boolean status;

	private String tGcmUserId;

	private String tImeiNumber;

	private String token;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tokenCreatedDateTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tokenExpiryDateTime;

	@Column(name = "tOtacValidated", columnDefinition = "BIT", nullable = true)
	private boolean tOtacValidated;

	@Temporal(TemporalType.TIMESTAMP)
	private Date userCreatedDate;

	private String userName;

	private String userType;

	private String zipcode;

	

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "createdBy")
	private User user;

	// bi-directional many-to-one association to User
	@OneToMany(mappedBy = "user")
	private List<User> users;

	// bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role role;

	// bi-directional many-to-one association to UserAccount
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<UserAccount> userAccounts;

	// bi-directional many-to-one association to Userorder
	@OneToMany(mappedBy = "user")
	private List<UserOrder> userorders;

	public User() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getFailedLoginAttempts() {
		return this.failedLoginAttempts;
	}

	public void setFailedLoginAttempts(long failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}

	public String getGcmUserId() {
		return this.gcmUserId;
	}

	public void setGcmUserId(String gcmUserId) {
		this.gcmUserId = gcmUserId;
	}

	public String getImeiNumber() {
		return this.imeiNumber;
	}

	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}

	public String getLastLoggedInIp() {
		return this.lastLoggedInIp;
	}

	public void setLastLoggedInIp(String lastLoggedInIp) {
		this.lastLoggedInIp = lastLoggedInIp;
	}

	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLogoutDate() {
		return this.logoutDate;
	}

	public void setLogoutDate(Date logoutDate) {
		this.logoutDate = logoutDate;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMakeModel() {
		return this.makeModel;
	}

	public void setMakeModel(String makeModel) {
		this.makeModel = makeModel;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMobileAppId() {
		return this.mobileAppId;
	}

	public void setMobileAppId(String mobileAppId) {
		this.mobileAppId = mobileAppId;
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getPasswordModifiedDate() {
		return this.passwordModifiedDate;
	}

	public void setPasswordModifiedDate(Date passwordModifiedDate) {
		this.passwordModifiedDate = passwordModifiedDate;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRequestSource() {
		return this.requestSource;
	}

	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

	public String getTGcmUserId() {
		return this.tGcmUserId;
	}

	public void setTGcmUserId(String tGcmUserId) {
		this.tGcmUserId = tGcmUserId;
	}

	public String getTImeiNumber() {
		return this.tImeiNumber;
	}

	public void setTImeiNumber(String tImeiNumber) {
		this.tImeiNumber = tImeiNumber;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getTokenCreatedDateTime() {
		return this.tokenCreatedDateTime;
	}

	public void setTokenCreatedDateTime(Date tokenCreatedDateTime) {
		this.tokenCreatedDateTime = tokenCreatedDateTime;
	}

	public Date getTokenExpiryDateTime() {
		return this.tokenExpiryDateTime;
	}

	public void setTokenExpiryDateTime(Date tokenExpiryDateTime) {
		this.tokenExpiryDateTime = tokenExpiryDateTime;
	}

	public boolean isEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public boolean isPasswordUpdated() {
		return passwordUpdated;
	}

	public void setPasswordUpdated(boolean passwordUpdated) {
		this.passwordUpdated = passwordUpdated;
	}

	public boolean isSelfRegistration() {
		return selfRegistration;
	}

	public void setSelfRegistration(boolean selfRegistration) {
		this.selfRegistration = selfRegistration;
	}

	public boolean isSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(boolean smartPhone) {
		this.smartPhone = smartPhone;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String gettGcmUserId() {
		return tGcmUserId;
	}

	public void settGcmUserId(String tGcmUserId) {
		this.tGcmUserId = tGcmUserId;
	}

	public String gettImeiNumber() {
		return tImeiNumber;
	}

	public void settImeiNumber(String tImeiNumber) {
		this.tImeiNumber = tImeiNumber;
	}

	public boolean istOtacValidated() {
		return tOtacValidated;
	}

	public void settOtacValidated(boolean tOtacValidated) {
		this.tOtacValidated = tOtacValidated;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getUserCreatedDate() {
		return this.userCreatedDate;
	}

	public void setUserCreatedDate(Date userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setUser(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setUser(null);

		return user;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<UserAccount> getUserAccounts() {
		return this.userAccounts;
	}

	public void setUserAccounts(List<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}

	public UserAccount addUserAccount(UserAccount userAccount) {
		getUserAccounts().add(userAccount);
		userAccount.setUser(this);

		return userAccount;
	}

	public UserAccount removeUserAccount(UserAccount userAccount) {
		getUserAccounts().remove(userAccount);
		userAccount.setUser(null);

		return userAccount;
	}

	public List<UserOrder> getUserorders() {
		return this.userorders;
	}

	public void setUserorders(List<UserOrder> userorders) {
		this.userorders = userorders;
	}

	public UserOrder addUserorder(UserOrder userorder) {
		getUserorders().add(userorder);
		userorder.setUser(this);

		return userorder;
	}

	public UserOrder removeUserorder(UserOrder userorder) {
		getUserorders().remove(userorder);
		userorder.setUser(null);

		return userorder;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
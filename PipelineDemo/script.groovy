def buildApp() {
	echo 'building app'
	echo "User is : ${user}"
}
def TestingApp() {
	input("Continue?")
	echo "WORKING ON ${GIT_BRANCH}"
}
def DeployingApp() {
	echo "Password is :${secret}"
}
def Unit() {
	echo "IN SIDE UNIT"
}
def Integration() {
	echo "IN SIDE INTEGRATION"
}

return this
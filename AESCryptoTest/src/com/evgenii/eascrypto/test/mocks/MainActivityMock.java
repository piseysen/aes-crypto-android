package com.evgenii.eascrypto.test.mocks;

import com.evgenii.aescrypto.interfaces.MainActivityInterface;

public class MainActivityMock implements MainActivityInterface {
	public boolean mTestIsBusy;
	public String mTestTrimmedMessage;
	public String mTestTrimmedPassword;
	public String mTestMessage;
	public boolean mTestOptionsMenuInvalidated;

	@Override
	public boolean hasMessage() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPassword() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void invalidateOptionsMenu() {
		mTestOptionsMenuInvalidated = true;
	}

	@Override
	public boolean isBusy() {
		return mTestIsBusy;
	}

	@Override
	public void setMessage(String message) {
		mTestMessage = message;
	}

	@Override
	public String trimmedMessage() {
		return mTestTrimmedMessage;
	}

	@Override
	public String trimmedPassword() {
		return mTestTrimmedPassword;
	}

	@Override
	public void updateBusy(boolean isBusy) {
		// TODO Auto-generated method stub

	}

}

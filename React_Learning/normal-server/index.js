// Sign up function
const signUp = async (userData) => {
    try {
      const response = await fetch('http://localhost:3000/users', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(userData),
      });
  
      if (!response.ok) {
        throw new Error('Sign up failed');
      }
  
      const data = await response.json();
      return data;
    } catch (error) {
      console.error('Error signing up:', error.message);
      throw error;
    }
  };
  
  // Login function
  const login = async (credentials) => {
    try {
      const response = await fetch('http://localhost:3000/login', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(credentials),
      });
  
      if (!response.ok) {
        throw new Error('Login failed');
      }
  
      const data = await response.json();
      return data.token;
    } catch (error) {
      console.error('Error logging in:', error.message);
      throw error;
    }
  };
  